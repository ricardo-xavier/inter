package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1710")
public class Somador1710 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
