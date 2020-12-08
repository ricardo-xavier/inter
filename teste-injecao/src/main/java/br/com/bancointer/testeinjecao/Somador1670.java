package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1670")
public class Somador1670 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
