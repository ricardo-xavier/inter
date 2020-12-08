package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador588")
public class Somador588 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
