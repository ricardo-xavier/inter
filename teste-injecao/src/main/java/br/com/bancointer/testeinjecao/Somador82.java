package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador82")
public class Somador82 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
