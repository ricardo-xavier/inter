package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador299")
public class Somador299 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
