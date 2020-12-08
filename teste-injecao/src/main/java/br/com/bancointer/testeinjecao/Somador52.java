package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador52")
public class Somador52 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
