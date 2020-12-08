package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador898")
public class Somador898 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
