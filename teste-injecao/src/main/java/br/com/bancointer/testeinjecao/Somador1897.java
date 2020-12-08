package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1897")
public class Somador1897 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
