//package zadanie07_3;
//
//import java.io.BufferedReader;
//import java.io.File;
//import java.io.FileReader;
//import java.io.IOException;
//
//public class File {
//    public String readFile(File file) {
//        StringBuffer fileBuffer = null;
//        String fileString = null;
//        String line = null;
//
//        try {
////            FileReader in = new FileReader(file);
//            BufferedReader brd = new BufferedReader(in);
//            fileBuffer = new StringBuffer();
//
//            while ((line = brd.readLine()) != null) {
//                fileBuffer.append(line).append(
//                        System.getProperty("line.separator"));
//            }
//
//            in.close();
//            fileString = fileBuffer.toString();
//        } catch (IOException e) {
//            return null;
//        }
//        return fileString;
//    }
//}
