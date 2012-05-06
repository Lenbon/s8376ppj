import java.lang.reflect.Field;
import java.lang.reflect.Method;

import zadanie7.*;

/**
 * Zadanie 7
 *
 * Korzystając z refleksji, napisać program, który na podstawie przygotowanej
 * wcześniej klasy tworzącej okno z komponentami GUI oraz informacji podanych
 * w pliku tekstowym ustala właściwości tych komponentów. Oto przykładowy plik
 * wejściowy oraz rzut ekranu okna. Poprawny wiersz pliku wejściowego jest
 * postaci: nazwaObiektuKomponentu  nazwaMetody  argumentyRozdzieloneSpacjami,
 * gdzie metody ustalające właściwości komponentów mogą przyjąć argumenty będące
 * liczbami typu int, literałami  logicznymi (true, false) oraz literałami
 * łańcuchowymi niezawierającymi spacji (np. "JReflection"). Dla uproszczenia
 * można założyć, że wszystkie podane komponenty są deklarowane w klasie
 * tworzącej okno jako pojedyncze atrybuty.
 *
 * @version     $Id$
 */
public class Zadanie7
{
    public static void main(String[] args)
    {
        try {
            Gui gui = new Gui();
            Class guiClass = gui.getClass();

            Loader loader = new Loader("files/in.txt");
            boolean fieldFound;
            Field fieldCurrent = null;

            for (Param param : loader.load()) {
                fieldFound = false;

                for (Field field : guiClass.getDeclaredFields()) {
                    if (field.getName().equals(param.getType())) {
                        fieldCurrent = field;
                        fieldFound = true;
                        break;
                    }
                }

                if (!fieldFound) {
                    throw new Exception("Nie odnaleziono typu: "
                            + param.getType());
                }

                String[] paramParams = param.getParams();
                Class[] methodParameterTypes = new Class[paramParams.length];
                Object[] methodParameters = new Object[paramParams.length];

                for (int i = 0; i < paramParams.length; i++) {
                    if (paramParams[i].equals("true")
                            || paramParams[i].equals("false")) {
                        methodParameterTypes[i] = boolean.class;
                        if (paramParams[i].equals("true")) {
                            methodParameters[i] = true;
                        } else {
                            methodParameters[i] = false;
                        }
                    } else {
                        try {
                            methodParameters[i] = Integer
                                    .parseInt(paramParams[i]);
                            methodParameterTypes[i] = int.class;
                        } catch (Exception e) {
                            methodParameterTypes[i] = String.class;
                            methodParameters[i] = paramParams[i];
                        }
                    }
                }

                Method method = fieldCurrent.get(gui).getClass().getMethod(
                        param.getMethod(), methodParameterTypes);
                method.invoke(fieldCurrent.get(gui), methodParameters);
            }

            gui.setVisible();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
