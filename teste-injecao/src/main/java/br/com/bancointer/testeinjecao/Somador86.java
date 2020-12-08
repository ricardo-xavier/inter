package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador86")
public class Somador86 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
