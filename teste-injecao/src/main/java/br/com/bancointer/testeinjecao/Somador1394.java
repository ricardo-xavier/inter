package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1394")
public class Somador1394 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
