package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1073")
public class Somador1073 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
