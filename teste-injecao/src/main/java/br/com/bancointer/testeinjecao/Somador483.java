package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador483")
public class Somador483 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
