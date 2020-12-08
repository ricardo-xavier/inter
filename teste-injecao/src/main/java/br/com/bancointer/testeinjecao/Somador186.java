package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador186")
public class Somador186 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
