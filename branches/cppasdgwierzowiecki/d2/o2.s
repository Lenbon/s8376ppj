	.file	"source.cpp"
	.section	.rodata.str1.1,"aMS",@progbits,1
.LC0:
	.string	"%u\n"
	.text
	.p2align 4,,15
.globl main
	.type	main, @function
main:
.LFB12:
	.cfi_startproc
	.cfi_personality 0x3,__gxx_personality_v0
	pushq	%rbx
	.cfi_def_cfa_offset 16
	subq	$16, %rsp
	.cfi_def_cfa_offset 32
	leaq	15(%rsp), %rbx
	.cfi_offset 3, -16
	jmp	.L2
	.p2align 4,,10
	.p2align 3
.L3:
	movzbl	15(%rsp), %esi
	movl	$.LC0, %edi
	xorl	%eax, %eax
	call	printf
.L2:
	movq	stdin(%rip), %rcx
	movl	$1, %edx
	movl	$1, %esi
	movq	%rbx, %rdi
	call	fread
	cmpq	$1, %rax
	je	.L3
	xorl	%eax, %eax
	addq	$16, %rsp
	popq	%rbx
	ret
	.cfi_endproc
.LFE12:
	.size	main, .-main
	.ident	"GCC: (Debian 4.4.5-8) 4.4.5"
	.section	.note.GNU-stack,"",@progbits
