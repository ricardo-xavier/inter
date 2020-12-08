package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1656")
public class Somador1656 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
