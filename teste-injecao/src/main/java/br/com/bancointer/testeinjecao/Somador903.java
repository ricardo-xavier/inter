package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador903")
public class Somador903 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
