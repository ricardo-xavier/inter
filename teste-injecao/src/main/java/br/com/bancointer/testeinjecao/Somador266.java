package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador266")
public class Somador266 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
