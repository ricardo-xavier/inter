package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador316")
public class Somador316 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
