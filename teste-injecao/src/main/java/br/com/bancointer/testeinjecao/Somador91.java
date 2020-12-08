package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador91")
public class Somador91 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
