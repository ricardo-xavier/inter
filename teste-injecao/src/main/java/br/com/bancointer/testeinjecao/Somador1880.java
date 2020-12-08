package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1880")
public class Somador1880 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
