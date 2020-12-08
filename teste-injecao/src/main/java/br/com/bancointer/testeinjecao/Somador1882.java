package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1882")
public class Somador1882 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
