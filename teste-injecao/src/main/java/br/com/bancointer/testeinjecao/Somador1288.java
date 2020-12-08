package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1288")
public class Somador1288 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
