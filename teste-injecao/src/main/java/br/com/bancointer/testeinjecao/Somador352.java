package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador352")
public class Somador352 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
