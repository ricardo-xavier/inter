package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador413")
public class Somador413 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
