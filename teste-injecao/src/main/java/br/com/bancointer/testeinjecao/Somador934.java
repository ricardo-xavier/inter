package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador934")
public class Somador934 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
