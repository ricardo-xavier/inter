package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador893")
public class Somador893 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
