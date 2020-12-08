package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador536")
public class Somador536 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
