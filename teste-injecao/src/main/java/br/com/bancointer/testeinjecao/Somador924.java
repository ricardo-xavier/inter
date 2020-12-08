package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador924")
public class Somador924 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
