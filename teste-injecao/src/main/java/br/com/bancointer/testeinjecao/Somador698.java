package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador698")
public class Somador698 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
