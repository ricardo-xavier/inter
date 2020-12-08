package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1859")
public class Somador1859 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
