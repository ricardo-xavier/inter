package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador442")
public class Somador442 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
