package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador775")
public class Somador775 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
