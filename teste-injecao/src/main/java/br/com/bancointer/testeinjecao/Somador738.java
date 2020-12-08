package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador738")
public class Somador738 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
