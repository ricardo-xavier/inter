package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1206")
public class Somador1206 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
