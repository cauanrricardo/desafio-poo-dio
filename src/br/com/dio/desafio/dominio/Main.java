package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Curso completo de java");
        curso1.setCargaHoraria(12);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso QA");
        curso2.setDescricao("Curso completo de Qualidade de software");
        curso2.setCargaHoraria(24);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria Java");
        mentoria1.setDescricao("Live de tira-dúvidas sobre POO");
        mentoria1.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java + QA");
        bootcamp.setDescricao("Seja especialista em back-end e QA");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev devCauan = new Dev();
        devCauan.setNome("Cauan Ricardo");
        devCauan.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos Cauan Ricardo: " + devCauan.getConteudosInscritos());
        devCauan.progredir();
        devCauan.progredir();
        devCauan.progredir();
        System.out.println("Conteúdos Concluídos de Cauan Ricardo: " + devCauan.getConteudosConcluidos());
        System.out.println("XP total: " + devCauan.calcularXp());

    }
}
