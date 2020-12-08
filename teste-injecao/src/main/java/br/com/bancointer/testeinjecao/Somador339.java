package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador339")
public class Somador339 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
