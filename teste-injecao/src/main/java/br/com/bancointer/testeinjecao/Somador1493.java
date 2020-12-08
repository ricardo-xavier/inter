package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1493")
public class Somador1493 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
