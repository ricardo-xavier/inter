package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador111")
public class Somador111 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
