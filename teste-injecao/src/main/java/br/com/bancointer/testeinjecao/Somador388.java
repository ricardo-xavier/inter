package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador388")
public class Somador388 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
