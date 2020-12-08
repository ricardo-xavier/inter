package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador785")
public class Somador785 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
