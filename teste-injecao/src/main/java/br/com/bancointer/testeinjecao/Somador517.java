package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador517")
public class Somador517 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
