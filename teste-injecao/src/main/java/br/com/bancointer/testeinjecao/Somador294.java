package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador294")
public class Somador294 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
