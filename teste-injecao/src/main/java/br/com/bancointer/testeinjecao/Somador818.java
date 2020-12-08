package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador818")
public class Somador818 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
