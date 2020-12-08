package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador31")
public class Somador31 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
