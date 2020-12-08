package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador446")
public class Somador446 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
