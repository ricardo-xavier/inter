package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador397")
public class Somador397 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
