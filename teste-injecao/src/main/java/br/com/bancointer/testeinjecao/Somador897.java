package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador897")
public class Somador897 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
