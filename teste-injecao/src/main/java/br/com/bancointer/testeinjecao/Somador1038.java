package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1038")
public class Somador1038 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
