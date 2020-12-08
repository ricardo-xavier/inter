package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador902")
public class Somador902 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
