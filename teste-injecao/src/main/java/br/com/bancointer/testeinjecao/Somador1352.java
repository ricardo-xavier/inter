package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1352")
public class Somador1352 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
