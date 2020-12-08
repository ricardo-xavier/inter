package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador771")
public class Somador771 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
