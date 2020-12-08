package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1187")
public class Somador1187 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
