package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1688")
public class Somador1688 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
