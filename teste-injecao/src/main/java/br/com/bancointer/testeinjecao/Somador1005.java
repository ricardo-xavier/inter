package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1005")
public class Somador1005 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
